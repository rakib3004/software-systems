import tensorflow as tf

# Load pre-trained model
base_model = tf.keras.applications.MobileNetV2(input_shape=(224, 224, 3), include_top=False)

# Freeze base model
base_model.trainable = False

# Add new classifier
model = tf.keras.Sequential([
    base_model,
    tf.keras.layers.GlobalAveragePooling2D(),
    tf.keras.layers.Dense(10, activation='softmax')
])

# Compile and train
model.compile(optimizer='adam', loss='sparse_categorical_crossentropy', metrics=['accuracy'])
