package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.domain.Book;
import org.springframework.stereotype.Component;

@Component
public interface BookMapper extends BaseMapper<Book> {
}
