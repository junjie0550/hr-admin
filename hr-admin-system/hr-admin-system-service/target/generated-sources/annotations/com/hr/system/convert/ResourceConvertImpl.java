package com.hr.system.convert;

import com.hr.system.dto.ResourceDto;
import com.hr.system.entity.Resource;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-27T11:38:49+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class ResourceConvertImpl implements ResourceConvert {

    @Override
    public ResourceDto entity2dto(Resource resource) {
        if ( resource == null ) {
            return null;
        }

        ResourceDto resourceDto = new ResourceDto();

        resourceDto.setId( resource.getId() );
        resourceDto.setResKey( resource.getResKey() );
        resourceDto.setResName( resource.getResName() );
        resourceDto.setParentId( resource.getParentId() );

        return resourceDto;
    }

    @Override
    public Resource dto2entity(ResourceDto resourceDto) {
        if ( resourceDto == null ) {
            return null;
        }

        Resource resource = new Resource();

        resource.setId( resourceDto.getId() );
        resource.setResKey( resourceDto.getResKey() );
        resource.setResName( resourceDto.getResName() );
        resource.setParentId( resourceDto.getParentId() );

        return resource;
    }

    @Override
    public List<ResourceDto> entityList2dtoList(List<Resource> resources) {
        if ( resources == null ) {
            return null;
        }

        List<ResourceDto> list = new ArrayList<ResourceDto>( resources.size() );
        for ( Resource resource : resources ) {
            list.add( entity2dto( resource ) );
        }

        return list;
    }
}
