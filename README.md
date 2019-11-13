# MAD (Mobile Application Development)
<p align="justify">Mobile Application Development refers to the processes and procedures that specially design for writing software for small, wireless computing devices and actually works on mobile and covers the advantages of the unique features a particular mobile device offers. Mobile applications define as a software programs that is designed for mobile devices where smartphones and tablets are included. The main purpose of developing mobile app is to run the gamut, from utility, productivity, and navigation to entertainment, sports, fitness and any others that provide us comfortable or imaginable. The best part of mobile app is that whatever that is not already on the phone will be provided through IOS or google play store. Mobile has big market in whole over the world which can tell us that mobile application has more demand as mobile market is rapidly increasing among people. Social media app, order providing apps are most usable mobile application. Likewise, our application also  can provide more benefits to the peoples who want to keep their daily information within application.</i></p> 

## IDE (Integrated Development Environment) for mobile application development:
<p align="justify">According to the survey of Google Play, it is confirmed that Android App has more demand than other app available in Google Play. It defines that demand of android application is very high due to which development of android mobile application is also high. To develop an android app, we required developing tools in order to develop appropriate mobile application for the customers or personal use. There are various IDE available in the internet which can help us to develop an appropriate mobile application. Some popular IDE used for developing mobile application are: Android Studio, Eclipse, NetBeans, Xamarin, AIDE, B4A, PhoneGap, Unity, Unreal, VS Code and so on. Among all these IDE available in the internet, we will use Android studio to develop our application.</p> 

![android](https://user-images.githubusercontent.com/54013992/68758047-2a3e9800-0635-11ea-96fe-391e001b95fa.png)
</br>(Source: techcrunch.com)
<p aligh="justify">Android Studio is most compatible IDE built by Google which can use Java as well as Kotlin (Programming Languages) to develop an Android App. We can take references to the Android SDK (Software Development Kit) in order to access UI elements like button, EditText and so on. Moreover, Android Studio is also useful for developing games when it comes for basic games through SDK and advanced games through libraries like LibGDX. To develop our mobile application, android studio will have great to develop and interactive application. We can add more features through additional dependencies added on it. Intead of Kotlin, we will use Java as programming language to develop an Android Application.</p>

## Architectural pattern used in (MAD) Mobile Application Development:
<p align="justify">Internet research can help us to find various architectural pattern that can be used in Mobile Application Development (MAD) such as MVW, MVP, MVC, MVVM and so on. Among them, we will use MVVM architectural pattern. MVVM design pattern is similar in function to the MVC  pattern but have little fundamental difference where MVVM included ViewModel through the unification of View and the Controller while MVC has separate View and Controller for different function. The question may arise on why ViewController is used on MVVM? It has straight solution of providing flexibility on code, decoupling the results in thin, and easy to read its classes in iOS. <strong>Model</strong> includes all the logics associated with the application data. <strong>View</strong> concern with UI screen where it includes layouts with the repository of all the widgets for display information. <strong>ViewModel</strong> is a behavior model of View that describes the behavior of View logic depending the result of Model work.</p>

![Untitled Diagram(1)](https://user-images.githubusercontent.com/54013992/68761455-2febac00-063c-11ea-8f8e-37971a944178.png)

<p align="justify">View is UI interaction which is required to display the data to the user. When we run the application, we can see front screen that contain data which is retrieved from Model. View get data from Model through ViewModel. ViewModel maintain the activity lifecycle and give the options to the Model either send notification or update the data provided by View. ViewModel work as layer between View and Model which can help to exchange the data for displaying and updating. All the crud operation will be possible through this pattern which is great solution for application development.</p>
<p>There are various reasons why I have selected MVVM pattern to develop my mobile application. The main reason of selecting MVVM as a architectural pattern for mobile application development is given in below content</p> 

## Reason of using MVVM architectural pattern:
<ol><li>Maintainability: If we able to make separation between different kinds of code then it makes us comfortable to make some     modification over various focused parts. </li> <li>Testability: Testing of code will be easier if each piece of the code are implemented in right form and dependencies in separate pieces of code which is possible through MVVM pattern.</li> <li>Extensibility: It makes more easier to replace or add new, similar-acting pieces of code in systematic format in the architecture.</li> <li>Reusability: If architecture is managed in well form then it can help on reusing the code over the application.</li></ol>

## Architecture of my Application:

![Untitled Diagram(3)](https://user-images.githubusercontent.com/54013992/68763674-1a2cb580-0641-11ea-96bf-b1238bb80efd.png)

<p align="justify">Through above diagram, we can comprehend about the working process of application using MVVM architecture pattern. User has basic roles on using application where they can add list of information in the application and also can set date and time to get notification about that added information. Everything that we can see on the screen is View part through which we can add data and also can do modification on saved data. When we run the application, ViewModel ask data from Model (Linked with database) then model provide data as notification to the Repository where repository confirm the data and send to ViewModel and then ViewModel send that notification to the View. Likewise, update command from View created by user handle by ViewModel and send update instruction to the Model due to which Model get modification and update the data to send update notification to the ViewModel. LiveData handle the live changes which cannot directly effect to the database. Through this process whole application work through the use of MVVM architectural pattern.</p>

# Application developed on MVVM architectural pattern:
<p align="justify">Here, I have prepared ToDoList application where we can add daily information to view our daily performance. Through this, we can know what we have done in which date and time. It can remind us about our works and makes us able to improve our performance. Moreover, it is helpful for remembering very important work through notification and various features available in this developed application. Some important features available in my developed application are defined in below points with appropriate screenshots:</p>
<ol> 
  <li><b>Run Application</b></li></br>
  
  ![Screenshot_2019-11-13-20-30-44-63](https://user-images.githubusercontent.com/54013992/68774023-9977b480-0654-11ea-92a5-0864f08673b6.png)
  ![Screenshot_2019-11-13-20-05-24-41](https://user-images.githubusercontent.com/54013992/68771910-05581e00-0651-11ea-9e65-4b8fefac545c.png)

  <li><b>User can add information with periority</b></li></br>
  
![Screenshot_2019-11-13-20-19-25-89](https://user-images.githubusercontent.com/54013992/68773126-1dc93800-0653-11ea-89fd-e739633cdb46.png)
![Screenshot_2019-11-13-20-19-40-18](https://user-images.githubusercontent.com/54013992/68773130-1efa6500-0653-11ea-86eb-ad41817daebb.png)
![Screenshot_2019-11-13-20-19-54-77](https://user-images.githubusercontent.com/54013992/68773123-1c980b00-0653-11ea-9270-30ccf09fcc55.png)

  <li><b>User can schedule notification</b></li></br>
  
![Screenshot_2019-11-13-20-23-18-51](https://user-images.githubusercontent.com/54013992/68773577-ea3add80-0653-11ea-97c9-892fdef7c1f5.png)
![Screenshot_2019-11-13-20-23-23-05](https://user-images.githubusercontent.com/54013992/68773578-eb6c0a80-0653-11ea-9e4b-856cbe584a63.png)
![Screenshot_2019-11-13-20-24-09-28](https://user-images.githubusercontent.com/54013992/68773572-e9a24700-0653-11ea-9894-dd969a1376a7.png)
  
  <li><b>User can view notification on defined date and time</b></li></br>
  
  ![Screenshot_2019-11-13-20-32-15-42](https://user-images.githubusercontent.com/54013992/68774127-bc09cd80-0654-11ea-8ea3-cff820841f38.png)
  
  <li><b>User can add todo information through voice recognization</b></li></br>
  
  ![Screenshot_2019-11-13-20-35-18-38](https://user-images.githubusercontent.com/54013992/68774419-2e7aad80-0655-11ea-9ed1-87dd500696c5.png)
  
  <li><b>Informations are Added in list view</b></li></br>
  
  ![Screenshot_2019-11-13-20-40-37-06](https://user-images.githubusercontent.com/54013992/68774957-ea3bdd00-0655-11ea-8852-0f5b09365dfa.png)
  
  <li><b>User can unlock activity (slide add activity to detail activity)</b></li></br>
  
  ![GIF-191113_220451](https://user-images.githubusercontent.com/54013992/68782602-c67e9400-0661-11ea-8aaf-0a3e5bef653f.gif)

  <li><b>User can update the list information</b></li></br>
   
![Screenshot_2019-11-13-20-42-14-91](https://user-images.githubusercontent.com/54013992/68775189-3850e080-0656-11ea-96ab-0533c358a10d.png)
 ![Screenshot_2019-11-13-20-42-23-52](https://user-images.githubusercontent.com/54013992/68775184-37b84a00-0656-11ea-96a0-01e499feef90.png)
   
  <li><b>User can delete per list through left to right slide</b></li></br>
   
   ![Screenshot_2019-11-13-20-47-44-44](https://user-images.githubusercontent.com/54013992/68775624-e9577b00-0656-11ea-8beb-52365c8cf6c5.png)

   
  <li><b>View list animation from right side to left side</b></li></br>
  
![GIF-191113_221047](https://user-images.githubusercontent.com/54013992/68783115-95529380-0662-11ea-892e-8ef437fb3a5c.gif)
  <li><b>User can do sharing</b></li></br>
 
 ![Screenshot_2019-11-13-20-49-00-16](https://user-images.githubusercontent.com/54013992/68775792-2a4f8f80-0657-11ea-8b08-188d6e6e0989.png)
![Screenshot_2019-11-13-20-49-12-28](https://user-images.githubusercontent.com/54013992/68775793-2b80bc80-0657-11ea-8601-aaa9b03bf44a.png)

  <li><b>User can delete all the list information</b></li></br>
  
![Screenshot_2019-11-13-20-53-50-80](https://user-images.githubusercontent.com/54013992/68776192-c8435a00-0657-11ea-96b3-7ac42b7feab5.png)
![Screenshot_2019-11-13-20-53-54-54](https://user-images.githubusercontent.com/54013992/68776190-c8435a00-0657-11ea-8fba-02bc4699b2b9.png)
  
  <li><b>User can refresh the activity</b></li></br>
  
  ![Screenshot_2019-11-13-20-49-00-16](https://user-images.githubusercontent.com/54013992/68776058-8e725380-0657-11ea-8d20-dd642acae3e1.png)
![Screenshot_2019-11-13-20-50-52-11](https://user-images.githubusercontent.com/54013992/68776060-8fa38080-0657-11ea-8f58-3689bf039633.png)

</ol>
