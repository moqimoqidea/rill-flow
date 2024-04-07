--redis_lock.lua
local val = redis.call("get", KEYS[1]);
if not val or val == ARGV[1] then
    -- FIXME: Code Completion From Here.
else
    return "FAIL"
end
