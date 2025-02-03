import tensorflow as tf
import numpy as np

# Generate some sine wave data
def create_dataset(timesteps=100):
    x = np.linspace(0, 50, timesteps)
    y = np.sin(x)
    return x, y

x, y = create_dataset()

# Reshape for RNN
x = x.reshape((1, 100, 1))
y = y.reshape((1, 100, 1))

# Build RNN model
model = tf.keras.Sequential([
    tf.keras.layers.SimpleRNN(50, activation='relu', input_shape=(100, 1)),
    tf.keras.layers.Dense(1)
])

# Compile and train
model.compile(optimizer='adam', loss='mse')
model.fit(x, y, epochs=200)
