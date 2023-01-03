package com.mahacoder.Calculator.service;

import org.springframework.stereotype.Service;

import com.mahacoder.Calculator.Dao.CalcDao;
import com.mahacoder.Calculator.Dao.DaoImpl;

@Service
public class CalcService {
	public int testDiv(int x,int y)
	{
		CalcDao c=new DaoImpl();
		return c.divNo(x, y);
	}

}
