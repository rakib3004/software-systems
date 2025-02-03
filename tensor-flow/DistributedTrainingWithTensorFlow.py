import tensorflow as tf

# Define a strategy
strategy = tf.distribute.MirroredStrategy()

with strategy.scope():
    # Build and compile model
    model = tf.keras.Sequential([
        tf.keras.layers.Dense(128, activation='relu', input_shape=(784,)),
        tf.keras.layers.Dense(10)
    ])
    model.compile(loss='sparse_categorical_crossentropy', optimizer='adam')

# Train the model
model.fit(x_train, y_train, epochs=5)
