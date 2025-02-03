import tensorflow as tf
from tensorflow.keras import layers

# Sample data
text_data = ["I love programming", "Python is amazing", "I hate bugs", "Debugging is fun"]
labels = [1, 1, 0, 1]  # Positive = 1, Negative = 0

# Tokenize and pad sequences
tokenizer = tf.keras.preprocessing.text.Tokenizer(num_words=1000)
tokenizer.fit_on_texts(text_data)
sequences = tokenizer.texts_to_sequences(text_data)
padded = tf.keras.preprocessing.sequence.pad_sequences(sequences, maxlen=5)

# Build a simple LSTM model
model = tf.keras.Sequential([
    layers.Embedding(input_dim=1000, output_dim=64, input_length=5),
    layers.LSTM(64),
    layers.Dense(1, activation='sigmoid')
])

# Compile and train
model.compile(loss='binary_crossentropy', optimizer='adam', metrics=['accuracy'])
model.fit(padded, labels, epochs=5)
//model.fit(padded, labels, epochs=5)
