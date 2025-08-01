package dev.nugget.cadastrodeninjas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjasRepository extends JpaRepository<NinjaModel, Long> {
}
