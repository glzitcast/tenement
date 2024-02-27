package online.yang.cloud.service;

import online.yang.cloud.model.Parking;
import online.yang.cloud.utils.PageInfo;


public interface ParkingService extends BaseService<Parking> {

    PageInfo<Parking> findAll(PageInfo<Parking> info, String parkOwner);

    Parking findByCondition(Parking parking);

}
