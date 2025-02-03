import tensorflow as tf

# Generator model
def generator_model():
    model = tf.keras.Sequential([
        tf.keras.layers.Dense(128, input_dim=100),
        tf.keras.layers.LeakyReLU(0.2),
        tf.keras.layers.Dense(784, activation='tanh')
    ])
    return model

# Discriminator model
def discriminator_model():
    model = tf.keras.Sequential([
        tf.keras.layers.Dense(128, input_shape=(784,)),
        tf.keras.layers.LeakyReLU(0.2),
        tf.keras.layers.Dense(1, activation='sigmoid')
    ])
    return model

# Define generator and discriminator
generator = generator_model()
discriminator = discriminator_model()
