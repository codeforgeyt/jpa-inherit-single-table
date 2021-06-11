package com.codeforgeyt.jpainheritsingletable;

import com.codeforgeyt.jpainheritsingletable.model.*;
import com.codeforgeyt.jpainheritsingletable.repository.ArtPieceRepository;
import com.codeforgeyt.jpainheritsingletable.repository.PaintingRepository;
import com.codeforgeyt.jpainheritsingletable.repository.SculptureRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaInheritSingleTableApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(JpaInheritSingleTableApplication.class, args);
		ArtPieceRepository sculptureRepository =
				configurableApplicationContext.getBean(SculptureRepository.class);
		ArtPieceRepository paintingRepository =
				configurableApplicationContext.getBean(PaintingRepository.class);

		ArtPiece sculpture = new Sculpture("John Doe", Material.WOOD, 200.2);
		ArtPiece painting = new Painting("Thom Smith", PaintingTechnique.OIL, 25.5, 44.9);

		sculptureRepository.save(sculpture);
		paintingRepository.save(painting);

//		sculptureRepository.delete(sculpture);
//		paintingRepository.delete(painting);
	}

}
