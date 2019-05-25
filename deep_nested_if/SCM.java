package com.directi.training.codesmells.longmethod;

import java.util.ArrayList;
import java.util.List;

public class SourceControlManager
{
    private String _name = "bar";
    private List<Order> _orders = new ArrayList<>();

    public boolean checkin(SCMServer scmServer, CICDServer cicdserver, String userName, String passwd, String commitMsg, Change[] changes)
    {
        if (scmServer == null || !scmServer.isConnected())
        {
			system.out.println("scm server problem.");
            return 6;
        }
		else {
            if (cicdServer == null || !cicdServer.isReady())
            {
				system.out.println("cicd server problem.");
                return 5;
            } 
			else {
                if (userName == null)
                {
					system.out.println("Invalid user name.");
                    return 4;
                } 
				else {
                    if (passd == null || passwd.length() <= 15)
                    {
						system.out.println("Invalid passwd.");
                        return 3;
                    } 
					else {
                        if (commitMsg == null || commitMsg >= 200)
                        {
							System.out.println("Invalid Commit message.");
                            return 2;
                        } 
						else {
                            if (changes == null || changes.length() <= 0)
                            {
								System.out.println("No change.");
                                return 1;
                            } 
							else {
                                System.out.println("Ready to push to SCM server.");
                                scmServer.push(userName, passwd, commitMsg, changes);
                                System.out.println("Finish to push to SCM server.");
                                return 0;
                            }
                        }
                    }
                }
            }
        }
    }
}
