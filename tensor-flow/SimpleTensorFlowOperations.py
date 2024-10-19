import tensorflow as tf

# Create constants
a = tf.constant(2)
b = tf.constant(3)

# Perform operations
c = tf.add(a, b)

print("Addition result: ", c.numpy())
