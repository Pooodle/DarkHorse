/* 작성자: 최보름
 * 기능: playerChartImpl service를 위한 인터페이스
 * */

package com.kosa.service;

import java.util.ArrayList;

import com.kosa.vo.PlayerChartVO;

public interface playerChart {
	public ArrayList<PlayerChartVO> monthSelect(String pyname);
	public ArrayList<PlayerChartVO> firstSelect(String pyname);
	public ArrayList<PlayerChartVO> secondSelect(String pyname);
}
