package com.sunil.example.hibernateExample.service;

import com.sunil.example.hibernateExample.dto.StudentInfoDto;

public interface StudentInfoService {

	StudentInfoDto getStudentInfo(int studentId);

	void save(String name, String email, int age);

}
