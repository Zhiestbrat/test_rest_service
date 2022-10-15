package ru.students.test_rest_service2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.students.test_rest_service2.model.Response;

import java.util.Date;

@Service
@RequiredArgsConstructor
@Qualifier("ModifySystemTime")
public class ModifySystemTime implements MyModifyService {
    @Override
    public Response modify(Response response) {
        response.setSystemTime(new Date().toString());
        return response;
    }
}
