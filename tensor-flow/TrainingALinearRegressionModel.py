import tensorflow as tf

# Generate some linear data
X = tf.constant([1., 2., 3., 4.], dtype=tf.float32)
Y = tf.constant([2., 4., 6., 8.], dtype=tf.float32)

# Create a linear model
class LinearModel(tf.Module):
    def __init__(self):
        self.w = tf.Variable(0.0)
        self.b = tf.Variable(0.0)
    
    def __call__(self, x):
        return self.w * x + self.b

model = LinearModel()

# Define loss function and optimizer
def loss_fn(y_pred, y_true):
    return tf.reduce_mean(tf.square(y_pred - y_true))

optimizer = tf.optimizers.SGD(learning_rate=0.01)

# Training loop
for epoch in range(1000):
    with tf.GradientTape() as tape:
        predictions = model(X)
        loss = loss_fn(predictions, Y)
    
    gradients = tape.gradient(loss, [model.w, model.b])
    optimizer.apply_gradients(zip(gradients, [model.w, model.b]))

print("Trained weights:", model.w.numpy(), model.b.numpy())
