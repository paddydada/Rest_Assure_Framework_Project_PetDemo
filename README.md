To complete the tasks and set up continuous integration (CI) with Jenkins, Git, GitHub, and Maven for the RestAssured project, follow the steps outlined below. These steps include running tests in both Eclipse and command-line, pushing code to GitHub, and setting up Jenkins to run the tests.

---

### **1. Execute Tests Using `pom.xml` Within Eclipse**
#### Steps:
- Open Eclipse and ensure you have Maven installed in your IDE.
- Right-click on the project (RestAssured Project) in the "Project Explorer."
- Navigate to **Run As** -> **Maven Test**.
  
This will execute the tests defined in the `pom.xml` using the TestNG suite.

---

### **2. Execute Tests Using `pom.xml` in Command Prompt**
#### Steps:
- Open the Command Prompt.
- Navigate to the project directory:
  ```bash
  cd C:\Users\pravin\restAssuredTraining\PetStoreAutomation
  ```
- Run the tests using the Maven command:
  ```bash
  mvn clean test
  ```
  
This will execute the tests specified in the `pom.xml`.

---

### **3. Commit Code in Local Repository (Git)**
#### Steps:
- Navigate to your project folder:
  ```bash
  cd C:\Users\pravin\restAssuredTraining\PetStoreAutomation
  ```
- Initialize the local repository (if not already done):
  ```bash
  git init
  ```
- Configure Git username and email:
  ```bash
  git config --global user.name "your name"
  git config --global user.email "abc@gmail.com"
  ```
- Add all files to the staging area:
  ```bash
  git add -A
  ```
- Commit your changes:
  ```bash
  git commit -m "Initial commit with RestAssured project"
  ```

---

### **4. Push Code to Remote Repository (GitHub)**
#### Steps:
- If the repository is not linked to GitHub, add the remote URL:
  ```bash
  git remote add origin https://github.com/pravin234/Rest_Assure_Framework_Project_PetDemo.git
  ```
- Push the code to GitHub:
  ```bash
  git push -u origin master
  ```

If prompted, provide your GitHub credentials or set up a personal access token.

---

### **5. Run Project in Jenkins (From GitHub)**

#### **CI Setup in Jenkins**

##### **Prerequisites:**
- Jenkins is installed.
- Git is installed.
- A repository exists on GitHub https://github.com/pravin234/Rest_Assure_Framework_Project_PetDemo.git
  
#### **Steps to Set Up Jenkins:**

1. **Install Git and Maven Plugins in Jenkins**:
   - Open Jenkins in your browser.
   - Go to **Manage Jenkins** -> **Manage Plugins**.
   - Install the **Git** plugin and **Maven Integration** plugin.

2. **Create a Jenkins Job**:
   - Go to Jenkins Dashboard.
   - Click on **New Item**.
   - Select **Freestyle Project** and name it (e.g., `RestAssuredCI`).
   - Click **OK**.

3. **Configure Source Code Management**:
   - In the Jenkins job configuration, under **Source Code Management**, choose **Git**.
   - Add your repository URL:
     ```
     https://github.com/pravin234/Rest_Assure_Framework_Project_PetDemo.git
     ```
   - Add credentials (GitHub username and password or personal access token).
  
4. **Set up Build Triggers**:
   - Scroll to the **Build Triggers** section.
   - Check **GitHub hook trigger for GITScm polling** to allow Jenkins to automatically trigger builds when new commits are pushed to GitHub.

5. **Add Maven Build Step**:
   - In the **Build** section, click on **Add build step** -> **Invoke top-level Maven targets**.
   - In the **Goals** field, enter:
     ```bash
     clean test
     ```

6. **Save and Build the Job**:
   - Save the job configuration.
   - You can now trigger the build manually by clicking **Build Now**, or it will be triggered automatically if the webhook is set up.

#### **Running Tests Automatically Using Webhooks**:
1. In GitHub, go to your repository settings.
2. Navigate to **Webhooks** -> **Add webhook**.
3. Add the Jenkins webhook URL (e.g., `http://your-jenkins-url/github-webhook/`).
4. Jenkins will now automatically trigger a build whenever you push new code to GitHub.

---

### **CI Process Overview**

1. **Install Git**: Make sure you have Git installed and configured on your system.

2. **Create GitHub Account & Repository**: 
   - If you haven't already, create a GitHub account.
   - Create a new repository for your project (e.g., `PetStoreAutomation`).

3. **Configure Git**:
   - Initialize the local repository (`git init`).
   - Add your project files using `git add` and commit using `git commit`.

4. **Push Code to GitHub**:
   - Add the remote GitHub repository using `git remote add origin`.
   - Push the local commits to GitHub using `git push`.

5. **Set Up Jenkins**:
   - Install and configure Jenkins with Git and Maven plugins.
   - Create a job in Jenkins that pulls code from GitHub, builds the project, and runs the tests.
   - Trigger the job via webhooks when new code is pushed to GitHub.

---

By following these steps, you can successfully set up continuous integration for your RestAssured project with Git, GitHub, and Jenkins. This setup will allow you to automatically run your test suite every time new code is pushed to the repository.
