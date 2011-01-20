package openconference.storage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import openconference.models.Conference;
import openconference.models.Session;
import openconference.models.Speaker;

public class MockConferenceRepository {
	public List<Conference> getConferences()
	{
		List<Conference> conferences = new ArrayList<Conference>();
		
		conferences.add(getConference());
		
		return conferences;
	}
	
	public Conference getConference()
	{
		Conference conference = new Conference("Demo Conference", "http://openconferenceprotocol.org/demo-conf/custom-logo.gif");
		
		Session first = new Session(
				"WEB304",
	            "All about jQuery",
	            new Date("1287224100000"),
	            new Date("1287225900000"),
	            "Room G04",
	            "Let\u0027s talk about how awesome jQuery is and how much we all love it.");

		first.addSpeaker(
				new Speaker(
					    "Bob Munro",
	                    "http://openconferenceprotocol.org/",
	                    "http://openconferenceprotocol.org/photo.png",
	                    "TwitterHandle",
	                    "contact@email.com",
	                    "This is the bio",
	                    "Job Title",
	                    "CompanyName"));
		
		first.addSpeaker(
				new Speaker(
					    "Jackson Watson",
		                "http://openconferenceprotocol.org/",
		                "http://openconferenceprotocol.org/photo.png",
		                "TwitterHandle",
		                "contact@email.com",
		                "This is the bio",
		                "Job Title",
		                "CompanyName"));
		
		conference.addSession(first);
		
		Session second = new Session(
				"WEB306",
		        "Even Faster Websites",
	            new Date("1287224100000"),
	            new Date("1287225900000"),
	            "Room G06",
	            "Let\u0027s make our websites fast.");

		second.addSpeaker(
				new Speaker(
						"Steve Souders",
		                "http://stevesouders.com/",
		                "http://stevesouders.com/images/souders-velocity2-200x300.jpg",
		                "@souders",
		                null,
		                "\n                        Steve previously worked at Yahoo! as the Chief Performance Yahoo!, where he blogged about web performance on Yahoo! Developer Network.\n                        He was named a Yahoo! Superstar.\n                        Steve worked on many of the platforms and products within the company,\n                        including running the development team for My Yahoo!.\n                        Prior to Yahoo!, Steve worked at several small to mid-sized startups including two companies he co-founded, Helix Systems and CoolSync.\n                        He also worked at General Magic, WhoWhere?, and Lycos.\n                     \n                        In the early 80\u0027s Steve caught the Artificial Intelligence bug and worked at a few companies doing research on Machine Learning,\n                        including several publications and conference appearances.\n                        He received a BS in Systems Engineering from the \n                        University of Virginia and a MS in Management Science and Engineering from \n                        Stanford University.\n                    ",
		                "Performance Guru",
		                 "Google"));
		conference.addSession(second);
				
		return conference;
	}
}
