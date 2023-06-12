package com.lms.user.service.service.base;



import com.lms.user.service.exception.DoesNotExistException;
import com.lms.user.service.repository.base.BaseRepository;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class BaseService<T,P,I> {
    private final BaseRepository<T, I> repository;

    public BaseService(BaseRepository<T, I> repository) {
        this.repository = repository;
    }

    public abstract P convertToDTO(T object);

    // MOGUCE UKLANJANJE convertArrayToDTO I findAll METODE
    public List<P> convertArrayToDTO(Iterable<T> array) {
        List<P> newArray = new ArrayList<>();
        array.forEach(element -> {
            newArray.add(this.convertToDTO(element));

        });
        return newArray;
    }

    public List<P> findAll(){
        return this.convertArrayToDTO(repository.findAll());
    }

    public P findOne(I id){
        if(!repository.findById(id).isPresent()){
            throw new DoesNotExistException();
        }
        return this.convertToDTO(repository.getById(id));
    }

    public Optional<T> findOneWithoutDTO(I id) {
        Optional<T> obj = repository.findById(id);
        if(!obj.isPresent()){
            throw new DoesNotExistException();
        }
        return obj;
    }

    public P save(T obj){
        return this.convertToDTO(repository.save(obj));
    }

    public P update(I id, T updatedEntity) {
        Optional<T> optionalEntity = repository.findById(id);
        if (optionalEntity.isPresent()) {
            T existingEntity = optionalEntity.get();
            updateEntity(existingEntity, updatedEntity);
            return this.convertToDTO(repository.save(existingEntity));
        }
        throw new DoesNotExistException();
    }

    private void updateEntity(T existingEntity, T updatedEntity) {
        Field[] fields = existingEntity.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object newValue = field.get(updatedEntity);
                if (newValue != null) {
                    field.set(existingEntity, newValue);
                }
            } catch (IllegalAccessException e) {
                System.out.println("STACK TRACEEEE");
                e.printStackTrace();
            }
        }
    }

    public void delete(I id){
        repository.deleteById(id);
    }



}
