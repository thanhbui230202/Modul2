package case_study.repository.Impl;

import case_study.repository.Interface.IEmployeeRepository;
import case_study.repository.Interface.Repository;
import ss16_text_file.bai_2.Country;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    @Override
    public void write() {
        IEmployeeRepository.super.write();
    }

    @Override
    public void read() {
        IEmployeeRepository.super.read();

    }

}
