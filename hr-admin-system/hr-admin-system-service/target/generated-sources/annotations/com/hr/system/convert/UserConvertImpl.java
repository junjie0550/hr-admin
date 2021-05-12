package com.hr.system.convert;

import com.hr.system.dto.UserDto;
import com.hr.system.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-27T11:38:49+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class UserConvertImpl implements UserConvert {

    @Override
    public UserDto entity2dto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setUsername( user.getUsername() );
        userDto.setPassword( user.getPassword() );
        userDto.setNickname( user.getNickname() );
        userDto.setEmail( user.getEmail() );
        userDto.setAvatar( user.getAvatar() );
        userDto.setMobile( user.getMobile() );
        userDto.setSex( user.getSex() );
        userDto.setStatus( user.getStatus() );
        userDto.setCreateTime( user.getCreateTime() );
        userDto.setUpdateTime( user.getUpdateTime() );
        userDto.setRemark( user.getRemark() );

        return userDto;
    }

    @Override
    public User dto2entity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDto.getId() );
        user.setUsername( userDto.getUsername() );
        user.setPassword( userDto.getPassword() );
        user.setNickname( userDto.getNickname() );
        user.setEmail( userDto.getEmail() );
        user.setAvatar( userDto.getAvatar() );
        user.setMobile( userDto.getMobile() );
        user.setSex( userDto.getSex() );
        user.setStatus( userDto.getStatus() );
        user.setCreateTime( userDto.getCreateTime() );
        user.setUpdateTime( userDto.getUpdateTime() );
        user.setRemark( userDto.getRemark() );

        return user;
    }

    @Override
    public List<UserDto> entityList2dtoList(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( users.size() );
        for ( User user : users ) {
            list.add( entity2dto( user ) );
        }

        return list;
    }
}
