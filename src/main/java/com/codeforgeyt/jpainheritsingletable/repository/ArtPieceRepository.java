package com.codeforgeyt.jpainheritsingletable.repository;

import com.codeforgeyt.jpainheritsingletable.model.ArtPiece;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ArtPieceRepository extends CrudRepository<ArtPiece, Long> {
}
