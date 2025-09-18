package kr.co.iei.kh.model.dao;

import org.apache.ibatis.annotations.Mapper;

import kr.co.iei.kh.model.vo.Kh;

@Mapper
public interface KhDao {

	Kh searchKh(Kh k);

}
