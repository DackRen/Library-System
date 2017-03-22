package com.librarysystem.dao;

import com.librarysystem.entity.Appointment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentDao {

    /**
     * 插入预约图书记录
     *
     * @param bookId id of book
     * @param studentId id of student
     * @return 插入的行数
     */
    int insertAppointment(@Param("bookId") long bookId, @Param("studentId") long studentId);

    /**
     * 通过主键查询预约图书记录，并且携带图书实体
     *
     * @param bookId id of book
     * @param studentId id of student
     * @return a appointment
     */
    Appointment queryByKeyWithBook(@Param("bookId") long bookId, @Param("studentId") long studentId);

}
