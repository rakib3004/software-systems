# Save model to a directory
model.save("/models/my_model/1")

# Start a TensorFlow Serving container
docker run -p 8501:8501 --name=tf_serving \
   --mount type=bind,source=/models/my_model,target=/models/my_model \
   -e MODEL_NAME=my_model -t tensorflow/serving
