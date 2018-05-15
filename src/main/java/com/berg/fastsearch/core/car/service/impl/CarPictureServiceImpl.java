package com.berg.fastsearch.core.car.service.impl;

import com.berg.fastsearch.core.car.entity.CarPicture;
import com.berg.fastsearch.core.car.repository.CarPictureRepository;
import com.berg.fastsearch.core.car.service.ICarPictureService;
import com.berg.fastsearch.core.car.web.dto.CarPictureDto;
import com.berg.fastsearch.core.car.web.dto.CarPictureQueryCondition;
import com.berg.fastsearch.core.system.base.service.impl.AbstractBaseServiceImpl;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p></p>
 *
 * @author bo.he02@hand-china.com
 * @version v1.0
 * @apiNote Created on 18-5-10
 */
@Service
public class CarPictureServiceImpl
        extends AbstractBaseServiceImpl<Long, CarPictureDto, CarPicture, CarPictureQueryCondition>
        implements ICarPictureService{

    @Autowired
    private CarPictureRepository carPictureRepository;

    @Override
    protected JpaRepository<CarPicture, Long> getRepository() {
        return carPictureRepository;
    }

    @Override
    protected CarPictureDto createDto() {
        return new CarPictureDto();
    }

    @Override
    protected CarPicture createEntity() {
        return new CarPicture();
    }

    @Override
    public List<CarPictureDto> findByCarId(Long carId) {
        return transform2D(carPictureRepository.findByCarId(carId));
    }
}
