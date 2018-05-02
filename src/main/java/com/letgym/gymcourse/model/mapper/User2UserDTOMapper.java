package com.letgym.gymcourse.model.mapper;

import com.letgym.gymcourse.model.User;
import com.letgym.gymcourse.model.custom.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 实体的映射
 *
 * @author jx-air
 * @version 1.0
 * @date Created in 2018/5/2 9:17
 */
@org.mapstruct.Mapper
public interface User2UserDTOMapper {
    User2UserDTOMapper MAPPER = Mappers.getMapper(User2UserDTOMapper.class);

    @Mappings({
            @Mapping(source = "isdelete", target = "delete"),//属性名不一致映射
            //@Mapping(target = "birthformat", expression = "java(org.apache.commons.lang3.time.DateFormatUtils.format(person.getBirthdate(),\"yyyy-MM-dd HH:mm:ss\"))"),//自定义属性通过java代码映射
    })
    public UserDTO User2UserDTO(User person);

    public List<UserDTO> User2UserDTOs(List<User> list);
}
