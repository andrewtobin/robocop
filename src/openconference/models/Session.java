package openconference.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Session {
	public Session()
	{
	}
	
	public Session(String code, String title, Date start, Date end, String room, String outline)
	{
		setCode(code);
		setTitle(title);
		setStart(start);
		setEnd(end);
		setRoom(room);
		setOutline(outline);
		
		_speakers = new ArrayList<Speaker>();
	}
	
	private String _code;
	private String _title;
	private Date _start;
	private Date _end;
	private String _room;
	private String _outline;
	private List<Speaker> _speakers;
	
	public String getCode()
	{
		return _code;
	}
	
	public void setCode(String code)
	{
		_code = code;
	}
	
	public String getTitle()
	{
		return _title;
	}
	
	public void setTitle(String title)
	{
		_title = title;
	}
	
	public Date getStart()
	{
		return _start;
	}
	
	public void setStart(Date start)
	{
		_start = start;
	}
	
	public Date getEnd()
	{
		return _end;
	}
	
	public void setEnd(Date end)
	{
		_end = end;
	}
	
	public String getRoom()
	{
		return _room;
	}
	
	public void setRoom(String room)
	{
		_room = room;
	}
	
	public String getOutline()
	{
		return _outline;
	}
	
	public void setOutline(String outline)
	{
		_outline = outline;
	}
	
	public List<Speaker> getSpeakers()
	{
		return _speakers;
	}
	
	public void addSpeaker(Speaker speaker)
	{
		_speakers.add(speaker);
	}
	
	public void removeSpeaker(Speaker speaker)
	{
		_speakers.remove(speaker);
	}
}
