package com.example.ZuhaakAhmad.i221352

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Header buttons
        val cameraBtn = findViewById<ImageView>(R.id.cameraBtn)
        val notificationBtn = findViewById<ImageView>(R.id.notificationBtn)
        val messageBtn = findViewById<ImageView>(R.id.messageBtn)

        // Story elements
        val yourStory = findViewById<LinearLayout>(R.id.yourStory)
        val story1 = findViewById<LinearLayout>(R.id.story1)
        val story2 = findViewById<LinearLayout>(R.id.story2)
        val story3 = findViewById<LinearLayout>(R.id.story3)
        val story4 = findViewById<LinearLayout>(R.id.story4)

        // Post elements
        val postOptionsBtn = findViewById<ImageView>(R.id.postOptionsBtn)
        val postImageContainer = findViewById<RelativeLayout>(R.id.postImageContainer)
        val postImage = findViewById<ImageView>(R.id.postImage)

        // Post action buttons
        val likeBtn = findViewById<ImageView>(R.id.likeBtn)
        val commentBtn = findViewById<ImageView>(R.id.commentBtn)
        val shareBtn = findViewById<ImageView>(R.id.shareBtn)
        val bookmarkBtn = findViewById<ImageView>(R.id.bookmarkBtn)

        // App title - make it clickable for profile access
        val appTitle = findViewById<TextView>(R.id.appTitle)

        // Bottom navigation
        val bottomNavigation = findViewById<ImageView>(R.id.bottomNavigation)

        // Header button click listeners
        cameraBtn.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }

        notificationBtn.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }

        messageBtn.setOnClickListener {
            val intent = Intent(this, MessageListActivity::class.java)
            startActivity(intent)
        }

        // App title click - go to profile
        appTitle.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        // Story click listeners
        yourStory.setOnClickListener {
            val intent = Intent(this, StoryCreateActivity::class.java)
            startActivity(intent)
        }

        story1.setOnClickListener {
            val intent = Intent(this, StoryViewActivity::class.java)
            intent.putExtra("username", "karennne")
            startActivity(intent)
        }

        story2.setOnClickListener {
            val intent = Intent(this, StoryViewActivity::class.java)
            intent.putExtra("username", "zackjohn")
            startActivity(intent)
        }

        story3.setOnClickListener {
            val intent = Intent(this, StoryViewActivity::class.java)
            intent.putExtra("username", "kieron_d")
            startActivity(intent)
        }

        story4.setOnClickListener {
            val intent = Intent(this, StoryViewActivity::class.java)
            intent.putExtra("username", "craig")
            startActivity(intent)
        }

        // Post interaction click listeners
        postOptionsBtn.setOnClickListener {
            // Navigate to different activities for testing
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }

        postImageContainer.setOnClickListener {
            // Double tap functionality - navigate to explore
            val intent = Intent(this, ExploreActivity::class.java)
            startActivity(intent)
        }

        likeBtn.setOnClickListener {
            // Navigate to NotificationFollowingActivity
            val intent = Intent(this, NotificationFollowingActivity::class.java)
            startActivity(intent)
        }

        commentBtn.setOnClickListener {
            // Navigate to ChatActivity for testing
            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent)
        }

        shareBtn.setOnClickListener {
            // Navigate to GalleryActivity
            val intent = Intent(this, GalleryActivity::class.java)
            startActivity(intent)
        }

        bookmarkBtn.setOnClickListener {
            // Navigate to SearchActivity
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        // Post content click for more activities (Fixed: Using LinearLayout instead of TextView)
        val likesLayout = findViewById<LinearLayout>(R.id.likesText)
        val captionLayout = findViewById<LinearLayout>(R.id.captionText)

        likesLayout.setOnClickListener {
            // Navigate to KyanProfileActivity
            val intent = Intent(this, KyanProfileActivity::class.java)
            startActivity(intent)
        }

        captionLayout.setOnClickListener {
            // Navigate to HighlightViewActivity
            val intent = Intent(this, HighlightViewActivity::class.java)
            startActivity(intent)
        }

        // Bottom navigation - simulate different tabs
        bottomNavigation.setOnClickListener {
            // Cycle through remaining activities
            val activities = listOf(
                CallActivity::class.java,
                StoryMessageActivity::class.java,
                LoginSwitchActivity::class.java
            )

            // Get random activity for testing
            val randomActivity = activities.random()
            val intent = Intent(this, randomActivity)
            startActivity(intent)
        }

        // Long press listeners for additional navigation
        postImage.setOnLongClickListener {
            // Long press on post image goes to LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            true
        }

        // Status bar click for SignUpActivity
        val statusBar = findViewById<ImageView>(R.id.statusBar)
        statusBar.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}