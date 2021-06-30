package com.example.demo.repository.user;

import com.example.demo.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
    @Query(value = "SELECT * FROM user_role WHERE id_user = ?1 ", nativeQuery = true)
    List<UserRole> findByIdUser (Integer id);

    @Query(value = "SELECT ur.* " +
            "FROM user_role as ur INNER JOIN role as r ON ur.id_role = r.id " +
            "WHERE ur.id_user =?1 AND  r.name = ?2",
            nativeQuery = true)
    Optional<UserRole> findByIdUserAndRoleName(Integer idUser, String roleName);
}
