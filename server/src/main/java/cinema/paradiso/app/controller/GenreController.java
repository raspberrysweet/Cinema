package cinema.paradiso.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cinema.paradiso.app.dto.GenreDto;
import cinema.paradiso.app.model.Genre;
import cinema.paradiso.app.service.GenreService;

@RestController
public class GenreController {

	@Autowired
	GenreService genreService;
	
	@RequestMapping(value="api/genres", method = RequestMethod.GET)
	public ResponseEntity<List<GenreDto>> getGenres(){
		List<Genre> genres = genreService.findAll();
		List<GenreDto> genresDto = new ArrayList<>();
		
		for (Genre g: genres) {
			GenreDto gDto = new GenreDto(g);
			genresDto.add(gDto);
		}
		return new ResponseEntity<>(genresDto, HttpStatus.OK);
	}
}
