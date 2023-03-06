package ch19;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonExample {
	public static void main(String[] args) throws IOException{
		//JSON 객체 생성
		JSONObject root = new JSONObject();
		
		//속성 추가
		root.put("id", "winter");
		root.put("name", "한겨울");
		root.put("age", "25");
		root.put("student", "ture");
		
		//객체 속성 추가
		JSONObject tel = new JSONObject();
		tel.put("home", "02-123-1234");
		tel.put("mobile", "010-1234-1234");
		root.put("tel", tel);
		
		//배열 속성 추가
		JSONArray skill = new JSONArray();
		skill.put("자바");
		skill.put("C");
		skill.put("C++");
		root.put("skill", skill);
		
		//JSON 얻기
		String json = root.toString();
		
		System.out.println(json);
		
		//파일로 저장
		Writer writer = new FileWriter("C:/Temp/member.json",Charset.forName("UTF-8"));
		writer.write(json);
		writer.flush();
		writer.close();
	}
}
