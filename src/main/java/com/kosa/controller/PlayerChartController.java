/* 작성자: 최보름
 * 기능: controller
 * /player_detail 주소가 들어왔을 때 디스패처서블릿이 컨트롤러로 매핑해주면 
 * /player_detail맞는 메서드가 요청을 처리함
 * 요청에서 @RequestParam("pyname") pyname 변수를 얻어서 사용함
 * model객체에 저장해서 리턴
 * 
 * 서비스를 주입받음(DI) :playerChartService이름을 갖는 객체를 주입받음
 * */

package com.kosa.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kosa.service.playerChart;
import com.kosa.vo.PlayerChartVO;

@Controller
public class PlayerChartController {

	@Resource(name="playerChartService")
	private playerChart svc;
	
	@RequestMapping(value="/player_detail")
	public String player_detail(Model model, @RequestParam("pyname") String pyname) {
		String tempstr = null;
		int tempint= 0;
		ArrayList<PlayerChartVO> templist = new ArrayList<PlayerChartVO>();
		ArrayList<String> monthlist = new ArrayList<String>();
		ArrayList firstlist = new ArrayList();
		ArrayList secondlist = new ArrayList();
		
		templist=svc.monthSelect(pyname);
		for(int i=0; i<templist.size(); i++) {
			tempstr="'"+ templist.get(i).getGameMonth()+"'";
			monthlist.add(tempstr);
		}
		templist=svc.firstSelect(pyname);
		for(int i=0; i<templist.size(); i++) {
			tempint=templist.get(i).getFirstCount();
			firstlist.add(tempint);
		}
		templist=svc.secondSelect(pyname);
		for(int i=0; i<templist.size(); i++) {
			tempint=templist.get(i).getSecondCount();
			secondlist.add(tempint);
		}
		
		model.addAttribute("chartlist", monthlist);
		model.addAttribute("firstlist", firstlist);
		model.addAttribute("secondlist", secondlist);
		return "darkhorse/player_detail";
		
		
		
		

		
		
	}
	
}
