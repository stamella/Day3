package com.capgemini.day3;

public class Telivision {
		private static boolean state;
		static int currentChannel;
		private static int	currentVolume;
		private static int newValue;
		public Telivision() {
			
		}
			public Telivision(boolean state, int currentchannel, int currentvolume,int newValue) {
				this.state=state;
				this.currentChannel=currentchannel;
				this.currentVolume=currentvolume;
				this.newValue=newValue;
			}

			public static boolean state() {
				state=true;
				return state;
			}
			
			public static boolean isState() {
				return state;
			}
			public static void setState(boolean state) {
				Telivision.state = state;
			}
			public static int getCurrentChannel() {
				return currentChannel;
			}
			public static void setCurrentChannel(int currentChannel) {
				Telivision.currentChannel = currentChannel;
			}
			public static int getNewValue() {
				return newValue;
			}
			public static void setNewValue(int newValue) {
				Telivision.newValue = newValue;
			}
			public static int increaseVolume() {
				setCurrentVolume(getCurrentVolume()+1);
				return getCurrentVolume();
				
			}
			public static int decreaseVolume() {
				
				setCurrentVolume(getCurrentVolume()-1);
				return getCurrentVolume();
			}
			public static int changeChannel() {
				if(state==true)
				{
				currentChannel=newValue;
				}
				return newValue;
			}
			public static int getCurrentVolume() {
				return currentVolume;
			}
			public static void setCurrentVolume(int currentVolume) {
				Telivision.currentVolume = currentVolume;
			}
			public void displayEmployeeDetails()
			{
				System.out.println("State :"+state+"currentvolume"+newValue+"CurrenntChannel"+currentChannel);
			}


}

