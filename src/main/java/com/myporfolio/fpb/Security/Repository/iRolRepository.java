package com.myporfolio.fpb.Security.Repository;

import com.myporfolio.fpb.Security.Entity.Rol;
import com.myporfolio.fpb.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
