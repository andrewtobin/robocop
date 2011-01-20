package openconference.models;

public class Speaker {
	public Speaker()
	{
	}
	
	public Speaker(String name, String websiteUrl, String photoUrl, String twitter,
			String email, String bio, String jobTitle, String company)
	{
		
	}
	
	private String _name;
	private String _websiteUrl;
	private String _photoUrl;
	private String _twitter;
	private String _email;
	private String _bio;
	private String _jobTitle;
	private String _company;
	
	public String getName()
	{
		return _name;
	}
	
	public void setName(String name)
	{
		_name = name;
	}
	
	public String getWebsiteUrl()
	{
		return _websiteUrl;
	}
	
	public void setWebsiteUrl(String websiteUrl)
	{
		_websiteUrl = websiteUrl;
	}
	
	public String getPhotoUrl()
	{
		return _photoUrl;
	}
	
	public void setPhotoUrl(String photoUrl)
	{
		_photoUrl = photoUrl;
	}
	
	public String getTwitter()
	{
		return _twitter;
	}
	
	public void setTwitter(String twitter)
	{
		_twitter = twitter;
	}
	
	public String getEmail()
	{
		return _email;
	}
	
	public void setEmail(String email)
	{
		_email = email;
	}
	
	public String getBio()
	{
		return _bio;
	}
	
	public void setBio(String bio)
	{
		_bio = bio;
	}
	
	public String getJobTitle()
	{
		return _jobTitle;
	}
	
	public void setJobTitle(String jobTitle)
	{
		_jobTitle = jobTitle;
	}
	
	public String getCompany()
	{
		return _company;
	}
	
	public void setCompany(String company)
	{
		_company = company;
	}
}
