package org.keffa.controller;

public class CarMapper {

    public static Car convertCarModelToApi(org.keffa.model.Car carModel) {
        Car carApi = new Car();
        carApi.setId(carModel.getId());
        carApi.setName(carModel.getName());
        return carApi;
    }

    public static org.keffa.model.Car convertCarApiToModel(Car carApi) {
        org.keffa.model.Car carModel = new org.keffa.model.Car();
        carModel.setId(carApi.getId());
        carModel.setName(carApi.getName());
        return carModel;
    }
}
