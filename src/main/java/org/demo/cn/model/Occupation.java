package org.demo.cn.model;

import org.springframework.stereotype.Component;

	@Component
	public class Occupation {
		
		private String name;

		private String occupation;
		
		public Occupation() {
			this.name = "Alex";
			this.occupation = "Doctor";
		}

		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getOccupation() {
			return occupation;
		}


		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}


		@Override
		public String toString() {
			return "Occupation [name=" + name + ", occupation=" + occupation + "]";
		}

		

		
		
	}
	
