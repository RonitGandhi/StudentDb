package com.ronit.studentdb;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ViewModal extends AndroidViewModel {
    private CourseRepository repository;
    private LiveData<List<CourseModal>> allCourses;
    public ViewModal(@NonNull Application application) {
        super(application);
        repository = new CourseRepository(application);
        allCourses = repository.getAllCourses();
    }
    public void insert(CourseModal model) {
        repository.insert(model);
    }

    // below line is to update data in our repository.
    public void update(CourseModal model) {
        repository.update(model);
    }

    // below line is to delete the data in our repository.
    public void delete(CourseModal model) {
        repository.delete(model);
    }

    // below method is to delete all the courses in our list.
    public void deleteAllCourses() {
        repository.deleteAllCourses();
    }

    // below method is to get all the courses in our list.
    public LiveData<List<CourseModal>> getAllCourses() {
        return allCourses;
    }
}
