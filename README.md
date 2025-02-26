# 📱 Click Counter App

A simple Android app built with **Kotlin** that increments a counter each time a button is clicked. The app uses a `TextView` to display the counter value and updates it dynamically on button press.

## 🚀 Features
- Click the button to increase the counter.
- Displays the updated counter value instantly.
- Simple and clean UI using **ConstraintLayout**.

## 📸 Demo
![Demo GIF](https://github.com/naomi-afrin/clickCounter/blob/master/click_counter_gif.gif)

## 🛠️ Technologies Used
- **Kotlin**
- **Android Studio**
- **ConstraintLayout**

## 📂 Project Structure
```
ClickCounterApp/
│── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/clickcounter/
│   │   │   │   ├── MainActivity.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── main_activity.xml
│   │   │   │   ├── drawable/
│   │   │   │   │   ├── bg.xml
│── build.gradle
│── AndroidManifest.xml
```

## 📜 Code Overview
### **MainActivity.kt**
```kotlin
class MainActivity : ComponentActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val btn: Button = findViewById(R.id.btn)
        val result_txt: TextView = findViewById(R.id.textView)

        btn.setOnClickListener {
            result_txt.setText("" + increaseCounter())
        }
    }
    fun increaseCounter(): Int{
        counter++
        return counter
    }
}
```

### **main_activity.xml**
```xml
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:background="@drawable/bg"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="0"
        android:textSize="48sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/btn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Click me"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView" />
</androidx.constraintlayout.widget.ConstraintLayout>
```

## 🔧 How to Run the Project
1. Clone this repository:
   ```sh
   git clone https://github.com/naomi-afrin/ClickCounterApp.git
   ```
2. Open **Android Studio** and open the project.
3. Connect a physical or virtual device.
4. Click **Run ▶** to build and run the app.

## 📌 Future Updates
- Add animations for button clicks.
- Implement dark mode support.
- Store the counter value using SharedPreferences.

## ✨ Contributing
Contributions are welcome! Feel free to fork this repo, make improvements, and submit a pull request.

## 📄 License
This project is licensed under the **MIT License**.

---
Made with ❤️ by Naomi Afrin Jalil

