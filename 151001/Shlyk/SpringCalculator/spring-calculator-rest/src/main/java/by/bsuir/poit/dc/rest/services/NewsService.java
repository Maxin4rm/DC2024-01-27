package by.bsuir.poit.dc.rest.services;

import by.bsuir.poit.dc.rest.api.dto.request.UpdateNewsDto;
import by.bsuir.poit.dc.rest.api.dto.request.UpdateNewsLabelDto;
import by.bsuir.poit.dc.rest.api.dto.request.UpdateNoteDto;
import by.bsuir.poit.dc.rest.api.dto.response.LabelDto;
import by.bsuir.poit.dc.rest.api.dto.response.NewsDto;
import by.bsuir.poit.dc.rest.api.dto.response.NoteDto;
import jakarta.validation.Valid;

import java.util.List;

/**
 * @author Paval Shlyk
 * @since 31/01/2024
 */
public interface NewsService {
    void create(@Valid UpdateNewsDto dto);

    void update(long newsId, @Valid UpdateNewsDto dto);

    NewsDto getById(long newsId);

    boolean delete(long newsId);

    void createNote(long newsId, @Valid UpdateNoteDto dto);

    void attachLabelById(long newsId, @Valid UpdateNewsLabelDto dto);

    boolean detachLabelById(long newsId, long labelId);

    List<NewsDto> getNewsByUserId(long userId);

    List<NoteDto> getNotesByNewsId(long newsId);

    List<LabelDto> getLabelsByNewsId(long newsId);
}
