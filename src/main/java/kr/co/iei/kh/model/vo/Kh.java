package kr.co.iei.kh.model.vo;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Alias(value="kh")
public class Kh {
	private int khNo;
	private String khName;
	private String khAddr;
	private String khFax;
}
