package com.sunil.example.hibernateExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil.example.hibernateExample.dao.StudentInfoDao;
import com.sunil.example.hibernateExample.dto.StudentInfoDto;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {

	@Autowired
	StudentInfoDao studentInfoDao;

	@Override
	public StudentInfoDto getStudentInfo(int studentId) {
		return studentInfoDao.getStudentInfo(studentId);
	}

	@Override
	public void save(String name, String email, int age) {
		studentInfoDao.save(name, email, age);
	}

}
