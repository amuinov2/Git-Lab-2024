package edu.unl.raikes.git;

public class GitLab {

	public static void main(String args[]) {
		System.out.print("This is a lesson on git.");
		GitLabHelper helper = new GitLabHelper("Name1", "Name2");
		helper.PrintWelcomeMessage();
	}
	
}
