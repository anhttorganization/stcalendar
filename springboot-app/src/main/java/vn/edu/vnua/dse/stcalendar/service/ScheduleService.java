//package vn.edu.vnua.dse.stcalendar.service;
//
//import java.io.IOException;
//import java.security.NoSuchAlgorithmException;
//import java.text.ParseException;
//import java.util.List;
//import java.util.Set;
//
//import vn.edu.vnua.dse.stcalendar.ggcalendar.jsonobj.GoogleEvent;
//import vn.edu.vnua.dse.stcalendar.vo.BaseResult;
//import vn.edu.vnua.dse.stcalendar.vo.ScheduleCreate;
//
//public interface ScheduleService {
//	public boolean isExist(ScheduleCreate scheduleCreate);
//	
//	public BaseResult<Set<String>> insert(String calenId, ScheduleCreate scheduleCreate) throws IOException, ParseException, NoSuchAlgorithmException;
//	
//	public Set<String> insert(String calenId, List<GoogleEvent> events) throws IOException;
//	
//	public void insert1(String calenId, List<String> events);
//}
