lines, dest = map(int, input().split())
vec = [0, 0]  # time and space
past_light_pos = 0
for li in range(lines):
    light_pos, red_time, green_time = map(int, input().split())
    to_light = light_pos - past_light_pos
    vec[0] += to_light
    vec[1] += to_light 
    time_rel_to_light = vec[0] % (red_time + green_time)
    if time_rel_to_light < red_time:
        vec[0] += red_time - time_rel_to_light
    past_light_pos = light_pos
if vec[1] < dest:
    vec[0] += dest - vec[1]
print(vec[0])
