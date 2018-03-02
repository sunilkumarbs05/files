package com.sunil.example.hibernateExample.dao;

import com.sunil.example.hibernateExample.dto.StudentInfoDto;

public interface StudentInfoDao {

	StudentInfoDto getStudentInfo(int studentId);

	void save(String name, String email, int age);

}
