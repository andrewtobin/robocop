package openconference.models;

import java.util.ArrayList;
import java.util.List;

public class Conference {
	public Conference()
	{
	}
	
	public Conference(String name, String logoUrl)
    {
    	setName(name);
    	setLogoUrl(logoUrl);
    	
    	_sessions = new ArrayList<Session>();
    }
	
	private String _name;
	private String _logoUrl;
	private List<Session> _sessions;	
	
	public String getName()
	{
		return _name;
	}
    
	public void setName(String name)
	{
		_name = name;
	}
	
	public String getLogoUrl()
	{
		return _logoUrl;
	}
    
	public void setLogoUrl(String logoUrl)
	{
		_logoUrl = logoUrl;
	}	
	
	public List<Session> getSessions()
	{
		return _sessions;
	}
	
	public void addSession(Session session)
	{
		_sessions.add(session);
	}
	
	public void removeSession(Session session)
	{
		_sessions.remove(session);
	}
}
