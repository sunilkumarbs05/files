package com.sunil.example.hibernateExample.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunil.example.hibernateExample.dto.StudentInfoDto;

@Repository
@Transactional
public class StudentInfoDaoImpl implements StudentInfoDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public StudentInfoDto getStudentInfo(int studentId) {
		return (StudentInfoDto) sessionFactory.getCurrentSession()
				.createQuery("from StudentInfoDto where id:id")
				.setParameter("id", studentId).uniqueResult();
	}

	@Override
	public void save(String name, String email, int age) {
		StudentInfoDto studentInfo = new StudentInfoDto();
		studentInfo.setAge(age);
		studentInfo.setName(name);
		studentInfo.setEmail(email);
		sessionFactory.getCurrentSession().save(studentInfo);

	}

}
