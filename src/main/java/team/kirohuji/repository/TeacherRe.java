/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.kirohuji.repository;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import team.kirohuji.domain.Teacher;

/**
 *
 * @author Administrator
 */
@Repository
public interface TeacherRe extends PagingAndSortingRepository<Teacher, Long>, JpaSpecificationExecutor<Teacher> {

        Teacher findByUserName(String userName);

        @Query("from Tuser t where id = :id")
        List<Teacher> queryFamilyList(@Param("id") Long id, Pageable pageable);

    }
