import tensorflow as tf
import gym

# Create environment
env = gym.make("CartPole-v1")

# Simple DNN model for policy
model = tf.keras.Sequential([
    tf.keras.layers.Dense(24, input_shape=(4,), activation='relu'),
    tf.keras.layers.Dense(24, activation='relu'),
    tf.keras.layers.Dense(2, activation='linear')
])

# Compile the model
model.compile(loss='mse', optimizer='adam')

# RL loop for training the policy

